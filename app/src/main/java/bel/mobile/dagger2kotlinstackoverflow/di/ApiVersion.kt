package bel.mobile.dagger2kotlinstackoverflow.di

import javax.inject.Qualifier

/**
 * Qualifier for int as an example of the type that can refer to different instances.
 *
 * Created by bel on 08/01/2018.
 */
@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ApiVersion