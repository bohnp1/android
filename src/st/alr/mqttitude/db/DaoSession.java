package st.alr.mqttitude.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import st.alr.mqttitude.db.ContactLink;

import st.alr.mqttitude.db.ContactLinkDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig contactLinkDaoConfig;

    private final ContactLinkDao contactLinkDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        contactLinkDaoConfig = daoConfigMap.get(ContactLinkDao.class).clone();
        contactLinkDaoConfig.initIdentityScope(type);

        contactLinkDao = new ContactLinkDao(contactLinkDaoConfig, this);

        registerDao(ContactLink.class, contactLinkDao);
    }
    
    public void clear() {
        contactLinkDaoConfig.getIdentityScope().clear();
    }

    public ContactLinkDao getContactLinkDao() {
        return contactLinkDao;
    }

}
