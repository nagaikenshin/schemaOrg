package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALIGNMENT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.AlignmentType;

@ExternalDomain
public class AlignmentTypeConverter implements DomainConverter<AlignmentType, String> {

	@Override
	public String fromDomainToValue(AlignmentType domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlignmentType fromValueToDomain(String value) {
		return new ALIGNMENT_TYPE(value);
	}

}
