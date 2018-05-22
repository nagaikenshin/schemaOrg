package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ALIGNMENT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.AlignmentType;

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
