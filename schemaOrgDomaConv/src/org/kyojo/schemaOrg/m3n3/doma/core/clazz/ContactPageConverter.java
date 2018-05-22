package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTACT_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ContactPage;

@ExternalDomain
public class ContactPageConverter implements DomainConverter<ContactPage, String> {

	@Override
	public String fromDomainToValue(ContactPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactPage fromValueToDomain(String value) {
		return new CONTACT_PAGE(value);
	}

}
