package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCOUNTABLE_PERSON;
import org.kyojo.schemaOrg.m3n3.core.Container.AccountablePerson;

@ExternalDomain
public class AccountablePersonConverter implements DomainConverter<AccountablePerson, String> {

	@Override
	public String fromDomainToValue(AccountablePerson domain) {
		return domain.getNativeValue();
	}

	@Override
	public AccountablePerson fromValueToDomain(String value) {
		return new ACCOUNTABLE_PERSON(value);
	}

}
