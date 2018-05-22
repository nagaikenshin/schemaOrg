package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTACT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.ContactType;

@ExternalDomain
public class ContactTypeConverter implements DomainConverter<ContactType, String> {

	@Override
	public String fromDomainToValue(ContactType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactType fromValueToDomain(String value) {
		return new CONTACT_TYPE(value);
	}

}
