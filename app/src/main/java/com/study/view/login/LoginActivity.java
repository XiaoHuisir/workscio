package com.study.view.login;

import android.os.Bundle;
import android.widget.TextView;

import com.study.R;
import com.study.base.BaseActivity;
import com.study.interfaces.IPersenter;
import com.study.interfaces.login.LoginContract;
import com.study.model.bean.LoginInfo;
import com.study.persenter.login.LoginPersenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.txt_username)
    TextView txtUsername;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        ((LoginPersenter)persenter).login("zq1","123456");
    }

    @Override
    protected IPersenter initPersenter() {
        return new LoginPersenter();
    }

    /**
     * 登录成功返回
     * @param loginInfo
     */
    @Override
    public void loginReturn(LoginInfo loginInfo) {

    }

    /**
     * 登录失败返回
     * @param err
     */
    @Override
    public void showErrMsg(String err) {

    }
}
