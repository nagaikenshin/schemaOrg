package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTAINED_IN_PLACE;
import org.kyojo.schemaOrg.m3n3.core.Container.ContainedInPlace;

@ExternalDomain
public class ContainedInPlaceConverter implements DomainConverter<ContainedInPlace, String> {

	@Override
	public String fromDomainToValue(ContainedInPlace domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContainedInPlace fromValueToDomain(String value) {
		return new CONTAINED_IN_PLACE(value);
	}

}
