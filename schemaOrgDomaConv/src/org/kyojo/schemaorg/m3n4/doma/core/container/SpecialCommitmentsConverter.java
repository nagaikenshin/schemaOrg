package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SPECIAL_COMMITMENTS;
import org.kyojo.schemaorg.m3n4.core.Container.SpecialCommitments;

@ExternalDomain
public class SpecialCommitmentsConverter implements DomainConverter<SpecialCommitments, String> {

	@Override
	public String fromDomainToValue(SpecialCommitments domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpecialCommitments fromValueToDomain(String value) {
		return new SPECIAL_COMMITMENTS(value);
	}

}
