package homework_26.warehouse.detail.dao;

// Интерфейс Stock c методами:
// •	добавить деталь на склад
// •	найти деталь по barCode
// •	обновить данные о детали
// •	удалить деталь
// •	общая масса всех деталей на складе
// •	средняя масса деталей на складе

import homework_26.warehouse.detail.model.Detail;

public interface Stock  {

    boolean addDetail(Detail detail); // добавить деталь на склад

    Detail findDetail(long barCode); // найти деталь по barCode

    Detail updateDetail(Detail detail); // обновить данные о детали

    Detail removeDetail(long barCode); // удалить деталь

    double totalWeight(); // общая масса всех деталей на складе

    double averageWeight(); // средняя масса деталей на складе


} // end of class
