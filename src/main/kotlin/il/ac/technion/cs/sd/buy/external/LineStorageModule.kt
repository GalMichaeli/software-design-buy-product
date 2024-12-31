package il.ac.technion.cs.sd.buy.external

import dev.misfitlabs.kotlinguice4.KotlinModule
import com.google.inject.Singleton

import il.ac.technion.cs.sd.buy.external.SuspendLineStorageFactory

class LineStorageModule : KotlinModule() {
    override fun configure() {
        bind<SuspendLineStorageFactory>().to<SuspendLineStorageFactoryImpl>().`in`<Singleton>()
    }
}