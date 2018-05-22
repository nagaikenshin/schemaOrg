package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.NORMAL_RANGE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.NormalRange;

@ExternalDomain
public class NormalRangeConverter implements DomainConverter<NormalRange, String> {

	@Override
	public String fromDomainToValue(NormalRange domain) {
		return domain.getNativeValue();
	}

	@Override
	public NormalRange fromValueToDomain(String value) {
		return new NORMAL_RANGE(value);
	}

}
