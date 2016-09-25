package nz.co.fitnet.jdbi;

import io.dropwizard.hibernate.AbstractDAO;

import java.io.Serializable;
import java.util.List;

import nz.co.fitnet.api.AccountToken;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

public class AccountTokenDAO extends AbstractDAO<AccountToken> {

	public AccountTokenDAO(final SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public AccountToken persist(final AccountToken entity) throws HibernateException {
		return super.persist(entity);
	}

	public void remove(final AccountToken token) {
		currentSession().delete(token);
	}

	public void remove(final long tokenId) {
		final AccountToken token = get(tokenId);
		remove(token);
	}

	@Override
	public AccountToken get(final Serializable id) {
		return super.get(id);
	}

	public List<AccountToken> listAll() {
		return list(currentSession().createCriteria(getEntityClass()));
	}
}
