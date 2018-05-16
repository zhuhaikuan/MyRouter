package com.xiaoniu.finance.router.permission;

/**
 * Created by wenzhonghu on 2018/4/28.
 */

public class InnerPermission extends Permission {
    @Override
    public PermissionType getPermission() {
        return PermissionType.INNER;
    }

    @Override
    public PermissionType getParentPermission() {
        return PermissionType.ALL;
    }


}
