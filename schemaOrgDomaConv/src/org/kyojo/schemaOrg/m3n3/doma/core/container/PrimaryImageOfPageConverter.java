package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PRIMARY_IMAGE_OF_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.PrimaryImageOfPage;

@ExternalDomain
public class PrimaryImageOfPageConverter implements DomainConverter<PrimaryImageOfPage, String> {

	@Override
	public String fromDomainToValue(PrimaryImageOfPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrimaryImageOfPage fromValueToDomain(String value) {
		return new PRIMARY_IMAGE_OF_PAGE(value);
	}

}
