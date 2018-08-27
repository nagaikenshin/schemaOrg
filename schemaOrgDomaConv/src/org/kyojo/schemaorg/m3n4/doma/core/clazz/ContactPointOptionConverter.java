package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTACT_POINT_OPTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ContactPointOption;

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
