package bel.mobile.dagger2kotlinstackoverflow.di

import android.content.Context
import android.content.SharedPreferences
import bel.mobile.dagger2kotlinstackoverflow.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule{

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Singleton
        fun provideContext(application: MyApplication) : Context =
                application.applicationContext

        @JvmStatic
        @Provides
        @Singleton
        fun provideSharedPreferences(context: Context): SharedPreferences =
                context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE)

        @JvmStatic
        @Provides
        @Singleton
        @ApiVersion
        fun provideApiVersion(): Int = 777

        @JvmStatic
        @Provides
        @Singleton
        @SecretCode
        fun provideSecretCode(): Int = 888

    }
}