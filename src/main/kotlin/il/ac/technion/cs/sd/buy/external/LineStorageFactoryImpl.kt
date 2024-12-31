package il.ac.technion.cs.sd.buy.external

internal class LineStorageFactoryImpl : LineStorageFactory {
    
    private class LineStorageImpl : LineStorage {
        
        override suspend fun appendLine(line: String) = Unit

        override suspend fun read(lineNumber: Int): String = ""

        override suspend fun numberOfLines(): Int = 0
    
    }

    override suspend fun open(fileName: String): LineStorage = LineStorageImpl()

}