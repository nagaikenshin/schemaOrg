package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTACT_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.ContactType;

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
