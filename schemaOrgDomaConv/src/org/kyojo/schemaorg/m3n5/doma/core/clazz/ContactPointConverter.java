package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTACT_POINT;
import org.kyojo.schemaorg.m3n5.core.Clazz.ContactPoint;

@ExternalDomain
public class ContactPointConverter implements DomainConverter<ContactPoint, String> {

	@Override
	public String fromDomainToValue(ContactPoint domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactPoint fromValueToDomain(String value) {
		return new CONTACT_POINT(value);
	}

}