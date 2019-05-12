package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.OVERVIEW;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Overview;

@ExternalDomain
public class OverviewConverter implements DomainConverter<Overview, String> {

	@Override
	public String fromDomainToValue(Overview domain) {
		return domain.getNativeValue();
	}

	@Override
	public Overview fromValueToDomain(String value) {
		return new OVERVIEW(value);
	}

}
