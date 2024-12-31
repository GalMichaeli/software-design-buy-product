package il.ac.technion.cs.sd.buy.external

internal class SuspendLineStorageFactoryImpl : SuspendLineStorageFactory {
    
    private class SuspendLineStorageImpl : SuspendLineStorage {
        
        override suspend fun appendLine(line: String) = Unit

        override suspend fun read(lineNumber: Int): String = ""

        override suspend fun numberOfLines(): Int = 0
    
    }

    override suspend fun open(fileName: String): SuspendLineStorage = SuspendLineStorageImpl()

}