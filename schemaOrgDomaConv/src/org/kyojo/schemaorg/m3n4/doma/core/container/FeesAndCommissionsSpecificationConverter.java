package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.FEES_AND_COMMISSIONS_SPECIFICATION;
import org.kyojo.schemaorg.m3n4.core.Container.FeesAndCommissionsSpecification;

@ExternalDomain
public class FeesAndCommissionsSpecificationConverter implements DomainConverter<FeesAndCommissionsSpecification, String> {

	@Override
	public String fromDomainToValue(FeesAndCommissionsSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public FeesAndCommissionsSpecification fromValueToDomain(String value) {
		return new FEES_AND_COMMISSIONS_SPECIFICATION(value);
	}

}
