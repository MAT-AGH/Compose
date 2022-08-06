package app.evolute.compose.di

import app.evolute.compose.data.repository.RepositoryImpl
import app.evolute.compose.domain.repository.RepositoryInterface
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepositoryInterface(repositoryImpl: RepositoryImpl): RepositoryInterface

//    @Binds
//    @Singleton
//    abstract fun bindEventHandlerInterface(homeFragment: HomeFragment): EventHandlerInterface

}