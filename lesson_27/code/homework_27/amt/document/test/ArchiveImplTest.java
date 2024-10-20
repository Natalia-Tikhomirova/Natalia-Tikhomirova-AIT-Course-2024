package homework_27.amt.document.test;

import homework_27.amt.document.dao.Archive;
import homework_27.amt.document.dao.ArchiveImpl;
import homework_27.amt.document.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArchiveImplTest {

    Archive archive;
    Document[] documents;

    @BeforeEach
    void setUp() {

        archive = new ArchiveImpl(5);

        documents = new Document[5];
        documents[0] = new Document(1234567890L,"T", "A" );
        documents[1] = new Document(1234567891L,"T1","A1" );
        documents[2] = new Document(1234567892L,"T2","A2" );
        documents[3] = new Document(1234567893L,"T3", "A3");

        for (int i = 0; i < documents.length; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest() {
        // 1. Не добавлять null:
        assertFalse(archive.addDocument(null), "Не должно быть возможности добавить null документ.");
        // 2. Не добавлять дубликат:
        assertFalse(archive.addDocument(documents[1]),"Не должно быть возможности добавить дубликат документа.");
        // 3. Добавляем новый документ:
        Document newDocument = new Document(1234567894L,"T4","A4");
        assertTrue(archive.addDocument(newDocument),"Документ должен быть добавлен успешно.");
        assertEquals(5,archive.size(),"Размер архива должен быть 5 после добавления нового документа.");
        // 4. Добавляем еще один документ, что превышает вместимость (capacity).
        Document oneMoreDocument = new Document(1334566894L,"T5", "A5");
        assertFalse(archive.addDocument(oneMoreDocument),"Не должно быть возможности добавить документ, превышающий вместимость.");
    }

    @Test
    void findByAuthorTest() {
        Document foundDocument = archive.findByAuthor("A");
        assertNotNull(foundDocument,"Документ с автором A должен быть найден");
        assertEquals("A",foundDocument.getAuthor(), "Автор документа должен быть 'A'");
    }

    @Test
    void findByIinTest() {
        Document foundDocument = archive.findByIin(1234567890L);
        assertEquals(foundDocument,archive.findByIin(1234567890L),"Документ с IIN 1234567890 должен быть найден.");
        assertNull(archive.findByIin(1234567895L),"Документ с IIN 1234567895 не должен существовать.");
    }

    @Test
    void findByTitleTest(){
        Document foundDocument = archive.findByTitle("T1");
        assertEquals("T1",foundDocument.getTitle(),"Название документа должно быть 'T1'");

    }

    @Test
    void removeDocumentTest() {
        assertEquals(documents[1],archive.removeDocument(1234567891L),"Документ с IIN " + documents[1].getIin() + " должен быть удален.");
        assertEquals(3,archive.size(),"Размер архива должен быть 3 после удаления");
        assertNull(archive.removeDocument(1234567895L),"Документ с IIN 1234567895 не должен быть найден для удаления");
    }

    @Test
    void sizeTest() {
        assertEquals(4,archive.size(), "Размер архива должен быть 4 после удаления одного документа" );
        archive.removeDocument(documents[1].getIin());
        assertEquals(3, archive.size(), "Размер архива должен быть 3 после удаления одного документа");
    }

    @Test
    void printDocumentsTest() {
        System.out.println("====================================");
        archive.printDocuments();
    }
} // end of class