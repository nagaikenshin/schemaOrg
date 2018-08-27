package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRIMARY_IMAGE_OF_PAGE;
import org.kyojo.schemaorg.m3n4.core.Container.PrimaryImageOfPage;

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
