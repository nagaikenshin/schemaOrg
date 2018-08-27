package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.AFFECTED_BY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AffectedBy;

@ExternalDomain
public class AffectedByConverter implements DomainConverter<AffectedBy, String> {

	@Override
	public String fromDomainToValue(AffectedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public AffectedBy fromValueToDomain(String value) {
		return new AFFECTED_BY(value);
	}

}
