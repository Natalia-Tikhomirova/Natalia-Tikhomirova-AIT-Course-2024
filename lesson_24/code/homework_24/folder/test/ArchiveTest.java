package homework_24.folder.test;

import homework_24.folder.controller.Archive;
import homework_24.folder.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Тестовый класс для архива:
class ArchiveTest {

    // Объект архива:
    Archive archive;

    // Массив документов:
    Document[] documents;
    // Переменная для хранения количества документов:
    int size = 0;

    @BeforeEach
    void setUp() {

        // Инициализация архива с вместимостью 5:
        archive = new Archive(5);

        // Инициализация массива документов с заданной длиной
        documents = new Document[5];

        // Заполнение массива документами:
        documents[0] = new Document("T","A", 1234567890L);
        documents[1] = new Document("T1","A1", 1234567891L);
        documents[2] = new Document("T2","A2", 1234567892L);
        documents[3] = new Document("T3","A3", 1234567893L);


        // TODO
        // Положить объекты в массив, которые "внутри" объекта archive:
        // Перебираем все документы в массиве:
        for (int i = 0; i < documents.length; i++) {
            // Добавляем текущий документ из массива в архив:
            archive.addDocument(documents[i]);
        }

        // Добавление документов в архив (цикл for-each):
        //        for (Document document : documents) {
        //            archive.addDocument(document);
        //        }
    }

    // method addDocument : boolean (true, false)
    @Test
    void addDocumentTest(){
        // 1. Не добавлять null:
        assertFalse(archive.addDocument(null), "Не должно быть возможности добавить null документ.");
        // 2. Не добавлять дубликат:
        assertFalse(archive.addDocument(documents[1]),"Не должно быть возможности добавить дубликат документа.");
        // 3. Добавляем новый документ:
        Document newDocument = new Document("T4","A4", 1334567894L);
        assertTrue(archive.addDocument(newDocument),"Документ должен быть добавлен успешно.");
        assertEquals(5,archive.size(),"Размер архива должен быть 5 после добавления нового документа.");
        // 4. Добавляем еще один документ, что превышает вместимость (capacity).
        Document oneMoreDocument = new Document("T5","A5", 1334566894L);
        assertFalse(archive.addDocument(oneMoreDocument),"Не должно быть возможности добавить документ, превышающий вместимость.");
    }


    // Проверка поиска существующего документа:
    @Test
    void findDocumentTest() {
        Document foundDocument = archive.findDocument(1234567890L);
        assertEquals(documents[0],archive.findDocument(1234567890L),"Документ с IIN 1234567890 должен быть найден."); // find existed book
        // Проверка поиска несуществующего документа:
        assertNull(archive.findDocument(1234567895L),"Документ с IIN 1234567895 не должен существовать.");// find absent book
    }

    @Test
    void removeDocumentTest(){
        // Удаление существующего документа - remove existed book:
        assertEquals(documents[1],archive.removeDocument(1234567891L),"Документ с IIN " + documents[1].getIin() + " должен быть удален.");
        // Проверка размера архива после удаления:
        assertEquals(3,archive.size(),"Размер архива должен быть 3 после удаления");
        // Удаление отсутствующего документа - remove absent book:
        assertNull(archive.removeDocument(1234567895L),"Документ с IIN 1234567895 не должен быть найден для удаления");
    }

    @Test

        // Проверка размера архива:
    void sizeTest(){
        assertEquals(4,archive.size(), "Размер архива должен быть 4 после удаления одного документа" );

        // Удаляем один документ для проверки изменения размера:
        archive.removeDocument(documents[1].getIin());
        assertEquals(3, archive.size(), "Размер архива должен быть 3 после удаления одного документа");
    }

    // Тест для вывода документов на экран:
    @Test
    void printDocumentsTest(){
        // Вывод документов на экран:
        System.out.println("====================================");
        archive.printDocuments();
    }
} // end of class