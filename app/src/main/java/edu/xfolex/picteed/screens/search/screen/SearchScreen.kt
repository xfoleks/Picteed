package edu.xfolex.picteed.screens.search.screen

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import edu.xfolex.picteed.screens.common.ListContent
import edu.xfolex.picteed.screens.search.viewmodel.SearchViewModel

@ExperimentalPagingApi
    @ExperimentalCoilApi
    @Composable
    fun SearchScreen(
        navController: NavHostController,
        searchViewModel: SearchViewModel = hiltViewModel()
    ) {
        val searchQuery by searchViewModel.searchQuery
        val searchedImages = searchViewModel.searchedImages.collectAsLazyPagingItems()

        Scaffold(
            topBar = {
                SearchWidget(
                    text = searchQuery,
                    onTextChange = {
                        searchViewModel.updateSearchQuery(query = it)
                    },
                    onSearchClicked = {
                        searchViewModel.searchHeroes(query = it)
                    },
                    onCloseClicked = {
                        navController.popBackStack()
                    }
                )
            },
            content = {
                ListContent(items = searchedImages)
                it.calculateTopPadding()
                it.calculateBottomPadding()
            }
        )
}