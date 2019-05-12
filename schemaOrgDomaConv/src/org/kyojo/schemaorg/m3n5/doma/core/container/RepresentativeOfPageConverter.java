package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.REPRESENTATIVE_OF_PAGE;
import org.kyojo.schemaorg.m3n5.core.Container.RepresentativeOfPage;

@ExternalDomain
public class RepresentativeOfPageConverter implements DomainConverter<RepresentativeOfPage, Boolean> {

	@Override
	public Boolean fromDomainToValue(RepresentativeOfPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public RepresentativeOfPage fromValueToDomain(Boolean value) {
		return new REPRESENTATIVE_OF_PAGE(value);
	}

}
