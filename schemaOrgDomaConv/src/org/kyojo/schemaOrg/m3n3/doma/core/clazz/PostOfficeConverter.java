package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POST_OFFICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PostOffice;

@ExternalDomain
public class PostOfficeConverter implements DomainConverter<PostOffice, String> {

	@Override
	public String fromDomainToValue(PostOffice domain) {
		return domain.getNativeValue();
	}

	@Override
	public PostOffice fromValueToDomain(String value) {
		return new POST_OFFICE(value);
	}

}
