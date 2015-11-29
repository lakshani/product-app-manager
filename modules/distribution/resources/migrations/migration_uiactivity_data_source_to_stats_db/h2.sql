CREATE TABLE IF NOT EXISTS APM_APP_HITS (
UUID VARCHAR2(500) NOT NULL,
APP_NAME VARCHAR2(200) NOT NULL,
VERSION VARCHAR2(50),
CONTEXT VARCHAR2(256) NOT NULL,
USER_ID VARCHAR2(50) NOT NULL,
TENANT_ID INTEGER,
HIT_TIME TIMESTAMP NOT NULL,
PRIMARY KEY (UUID, USER_ID, TENANT_ID, HIT_TIME),
FOREIGN KEY (UUID) REFERENCES APM_APP(UUID) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (USER_ID) REFERENCES APM_SUBSCRIBER(USER_ID) ON UPDATE CASCADE ON DELETE CASCADE
);