package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTACT_OPTION;
import org.kyojo.schemaorg.m3n5.core.Container.ContactOption;

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