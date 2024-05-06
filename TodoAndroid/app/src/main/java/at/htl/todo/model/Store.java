package at.htl.todo.model;

import javax.inject.Inject;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

public class Store {
    public BehaviorSubject<Model> subject;

    @Inject
    Store() {
        subject = BehaviorSubject.createDefault(new Model());
    }

}
