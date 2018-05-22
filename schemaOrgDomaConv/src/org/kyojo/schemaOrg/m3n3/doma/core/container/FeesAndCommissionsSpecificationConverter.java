package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FEES_AND_COMMISSIONS_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Container.FeesAndCommissionsSpecification;

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
