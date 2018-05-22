package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTACT_POINT_OPTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPointOption;

@ExternalDomain
public class ContactPointOptionConverter implements DomainConverter<ContactPointOption, String> {

	@Override
	public String fromDomainToValue(ContactPointOption domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactPointOption fromValueToDomain(String value) {
		return new CONTACT_POINT_OPTION(value);
	}

}
