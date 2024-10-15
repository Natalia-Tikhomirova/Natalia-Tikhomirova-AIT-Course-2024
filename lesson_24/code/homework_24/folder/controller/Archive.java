package homework_24.folder.controller;

import homework_24.folder.model.Document;

// Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.

public class Archive {

    // fields

    private Document[]documents;                            // Массив для хранения документов
    private int size;                                       // Текущий размер (количество документов)

    // constructor

    public Archive(int capacity) {
        this.documents = new Document[capacity];            // Инициализация массива документов
        this.size = 0;                                      // Установка начального размера
    }
    // CRUD methods

    public boolean addDocument(Document document){
        // negative cases

        if(document == null){
            return false;                                  // Не удалось добавить, документ отсутствует
        }
        // Проверка, заполнен ли массив:
        if(size == documents.length){ // Проверка, заполнен ли массив
            return false;                                  // Не удалось добавить, массив заполнен
        }
        if (!(findDocument(document.getIin()) == null)){
            return false;                                  // Документ с таким IIN не существует
        }
        // positive case
        documents[size] = document;                       // Добавление документа
        size++;                                           // Увеличение счетчика документов
        return true;                                      // Успешное добавление

    }


    // print documents
    public void printDocuments(){
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }

    // find by author

    public Document findByAuthor(String author){
        // Создаем цикл для перебора всех документов в массиве:
        for (int i = 0; i < size; i++) {
            // Проверяем, совпадает ли автор текущего документа с указанным автором:
            // documents[i] - это текущий документ в массиве
            // getAuthor() возвращает имя автора документа
            // equals(author) сравнивает это имя с переданным именем автора
            if(documents[i].getAuthor().equals(author)){
                // Если совпадение найдено, возвращаем текущий документ:
                return documents[i];
            }
        }
        // Если документ с указанным автором не найден, возвращаем null:
        return null;
    }

    public  Document findDocument(long iin){
        // Проходим по всем документам в массиве:
        for (int i = 0; i < size; i++) {
            // Проверяем, совпадает ли ИИН текущего документа с переданным ИИН
            // documents[i].getIin() возвращает ИИН текущего документа
            if(documents[i].getIin() == iin){         // Убеждаемся, что вызов getIin() корректный
                return documents[i];                  // Возвращаем найденный документ
            }
        }
        // Если документ с указанным ИИН не найден, возвращаем null:
        return null;
    }


    // Метод для удаления документа по уникальному идентификационному номеру (IIN):
    public Document removeDocument(long iin){
        // Проходим по всем документам в массиве:
        for (int i = 0; i < size; i++) {
            // Проверяем, совпадает ли IIN текущего документа с переданным IIN:
            if(documents[i].getIin() == iin){
                // Сохраняем ссылку на документ, который будем удалять (жертва):
                Document victim = documents[i];
                // Заменяем удаляемый документ последним документом в массиве:
                documents[i] = documents[size - 1];
                // Затираем ссылку на последний документ, чтобы избежать утечек памяти:
                documents[size - 1] = null;
                // Уменьшаем размер массива на 1, так как один документ удален
                size--;
                // Возвращаем ссылку на удалённый документ
                return victim;
            }
        }
        return null; // Если документ с указанным IIN не найден, возвращаем null
    }


    // boolean updateDocument()

    public int size(){
        return size;
    }

} // end class
