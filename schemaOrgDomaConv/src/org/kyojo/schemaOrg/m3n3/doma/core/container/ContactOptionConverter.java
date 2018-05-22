package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTACT_OPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.ContactOption;

@ExternalDomain
public class ContactOptionConverter implements DomainConverter<ContactOption, String> {

	@Override
	public String fromDomainToValue(ContactOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactOption fromValueToDomain(String value) {
		return new CONTACT_OPTION(value);
	}

}
