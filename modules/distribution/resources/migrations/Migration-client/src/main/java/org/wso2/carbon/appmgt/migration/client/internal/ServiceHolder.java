/*
* Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.wso2.carbon.appmgt.migration.client.internal;

import org.wso2.carbon.appmgt.impl.AppManagerConfigurationService;
import org.wso2.carbon.core.services.callback.LoginSubscriptionManagerService;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.registry.core.service.TenantRegistryLoader;
import org.wso2.carbon.rest.api.service.RestApiAdminService;
import org.wso2.carbon.rest.api.stub.RestApiAdmin;
import org.wso2.carbon.user.core.service.RealmService;

public class ServiceHolder {
    //Registry Service which is used to get registry data.
    private static RegistryService registryService;

    //Realm Service which is used to get tenant data.
    private static RealmService realmService;

    private static LoginSubscriptionManagerService loginSubscriptionManagerService;

    //Tenant registry loader which is used to load tenant registry
    private static TenantRegistryLoader tenantRegLoader;
    private static RestApiAdminService restApiAdmin;

    public static AppManagerConfigurationService getAppManagerConfigurationService() {
        return appManagerConfigurationService;
    }

    public static void setAppManagerConfigurationService(AppManagerConfigurationService appManagerConfigurationService) {
        ServiceHolder.appManagerConfigurationService = appManagerConfigurationService;
    }

    private static AppManagerConfigurationService appManagerConfigurationService;

    /**
     * Method to get RegistryService.
     *
     * @return registryService.
     */
    public static RegistryService getRegistryService() {
        return registryService;
    }

    /**
     * Method to set registry RegistryService.
     *
     * @param service registryService.
     */
    public static void setRegistryService(RegistryService service) {
        registryService = service;
    }

    /**
     * This method used to get RealmService.
     *
     * @return RealmService.
     */
    public static RealmService getRealmService() {
        return realmService;
    }

    /**
     * Method to set registry RealmService.
     *
     * @param service RealmService.
     */
    public static void setRealmService(RealmService service) {
        realmService = service;
    }

    /**
     * This method used to get TenantRegistryLoader
     *
     * @return tenantRegLoader  Tenant registry loader for load tenant registry
     */
    public static TenantRegistryLoader getTenantRegLoader() {
        return tenantRegLoader;
    }

    /**
     * This method used to set TenantRegistryLoader
     *
     * @param service Tenant registry loader for load tenant registry
     */
    public static void setTenantRegLoader(TenantRegistryLoader service) {
        tenantRegLoader = service;
    }

}
