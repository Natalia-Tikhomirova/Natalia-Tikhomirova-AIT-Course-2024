package homework_24.folder.test;

import homework_24.folder.controller.Archive;
import homework_24.folder.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;

    Document[] documents;
    int size = 0;

    @BeforeEach
    void setUp() {

        archive = new Archive(5);
        documents[0] = new Document("T","A", 1234567890L);
        documents[1] = new Document("T1","A1", 1234567891L);
        documents[2] = new Document("T2","A2", 1234567892L);
        documents[3] = new Document("T3","A3", 1234567893L);
        documents[4] = new Document("T4","A4", 1234567894L);
    }

    // TODO
    // положить объекты в массив, которые "внутри" объекта archive

    @Test
    void findDocumentTest() {
        Document foundDocument = Archive.findDocument(1234567890L);
        assertEquals(documents[0],Archive.findDocument(1234567890L)); // find existed book
        assertNull(archive.findDocument(1234567890L));                // find absent book
    }
}