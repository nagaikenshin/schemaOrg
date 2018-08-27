package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.POST_OFFICE_BOX_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.PostOfficeBoxNumber;

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
