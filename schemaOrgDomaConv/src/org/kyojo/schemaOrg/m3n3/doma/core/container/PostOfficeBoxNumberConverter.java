package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.POST_OFFICE_BOX_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.PostOfficeBoxNumber;

@ExternalDomain
public class PostOfficeBoxNumberConverter implements DomainConverter<PostOfficeBoxNumber, String> {

	@Override
	public String fromDomainToValue(PostOfficeBoxNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public PostOfficeBoxNumber fromValueToDomain(String value) {
		return new POST_OFFICE_BOX_NUMBER(value);
	}

}
