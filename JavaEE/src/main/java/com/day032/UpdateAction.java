package com.day032;

public class UpdateAction {
    UpdateImpl updateImpl;
    // 写构造器：与类名相同，且没有返回值，可有参也可无参
    public UpdateAction(UpdateImpl updateImpl){
        this.updateImpl = updateImpl;
    }

    // 按钮
    public void update(){
        System.out.println("点击修改");
        updateImpl.update();
    }
}
