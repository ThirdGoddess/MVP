package com.brk.mvp;

public class MainPresenter implements Presenter {

    PeopleBean peopleBean = new PeopleBean("NorthernBrain", 0);

    private View view;

    public MainPresenter(View view) {
        this.view = view;
    }

    @Override
    public void addNum() {

        peopleBean.setNum(peopleBean.getNum() + 1);
        view.addNum(peopleBean.toString());
    }

    @Override
    public void lessNum() {
        peopleBean.setNum(peopleBean.getNum() - 1);
        view.addNum(peopleBean.toString());
    }

    @Override
    public void show() {
        view.showNum(peopleBean.toString());
    }
}
