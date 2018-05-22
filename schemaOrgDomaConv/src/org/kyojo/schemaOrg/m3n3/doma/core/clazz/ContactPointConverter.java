package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTACT_POINT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPoint;

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
