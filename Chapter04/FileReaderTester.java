


class FileReaderTester extends TestCase {
    public FileReaderTester (String name) {
        super(name);
    }

    protected void setUp(){
        try{
            _input = new FileReader("data.txt");
            _empty = newEmptyFile();
            
        } catch (IOException e){
            throw new RuntimeException(e.toString());
        }
    }

    private FileReader newEmptyFile() throws IOException {
        File empty = new File("empty.txt");
        FileOutputStream out = new FileOutputStream(empty);
        out.close();
        return new FileReader(empty);
    }

    public void testEmptyRead() throw IOException {
        assertEquals(-1, _empty.read());
    }


    protected void tearDown(){
        try {
            _input.close();
        } catch (IOException e){
            throw new RuntimeException("error on closing test file");
        }
    }

    public void testRead() throws IOException {
        char ch = '&';
        for (int i = 0; i < 4; i++)
            ch = (char) _input.read();
        assert ('d' == ch);
    }

    public 
        void testReadAtEnd() throws IOException {
            int ch = -1234;
            for (int i = 0; i < 141; i++)
                ch = _input.read();
            assertEquals(-1, _input.read());
        }
    public void testReadBoundaries() throws IOException {
        assertEquals("read first char", 'B', _input.read());
        int ch;
        for (int i = 1; i < 140; i++)
            ch = _input.read();
        assertEquals("read last char", '6', _input.read());
        assertEquals("read at end", -1, _input.read());
        assertEquals("readpast end", -1, _input.read());
    }

    public void testReadAfterClose() throws IOException {
        _input.close();
        try {
            _input.read();
            fail("no exception for read past end");
        } catch (IOException io){}
    }


    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new FileReaderTester("testRead"));
        suite.addTest(new FileReaderTester("testReadAtEnd"));
        return suite;
    }

    public static void main(String[] args){
        //junit.textui.TestRunner.run(suite());
        junit.textui.TestRunner.run(new TestSuite(FileReaderTester.class));
    }
}
