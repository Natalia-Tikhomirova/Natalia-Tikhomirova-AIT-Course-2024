package homework_27.amt.document.dao;

import homework_27.amt.document.model.Document;

public class ArchiveImpl implements Archive {

    private Document[] documents;
    private int size;

    public ArchiveImpl(int capacity){
        this.documents = new Document[capacity];
        this.size = 0;
    }


    @Override
    public boolean addDocument(Document document){
        if(document == null) {
            return false;
        }
            if(size == documents.length){
                return false;
            }
            if(!(findByIin(document.getIin()) == null)){
                return false;
            }

        documents[size] = document;
        size++;
        return true;
    }

    @Override
    public Document findByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getAuthor().equals(author)){
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document findByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getTitle().equals(title)){
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document findByIin(long iin) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getIin() == iin){
                return documents[i];
            }
        }
        return null;
    }

    @Override
    public Document removeDocument(long iin) {
        for (int i = 0; i < size; i++) {
            if(documents[i].getIin() == iin){
                Document victim = documents[i];
                documents[i] = documents[size - 1];
                documents[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDocuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }
} // end of class


