package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ALIGNMENT_OBJECT;
import org.kyojo.schemaorg.m3n4.core.Clazz.AlignmentObject;

@ExternalDomain
public class AlignmentObjectConverter implements DomainConverter<AlignmentObject, String> {

	@Override
	public String fromDomainToValue(AlignmentObject domain) {
		return domain.getNativeValue();
	}

	@Override
	public AlignmentObject fromValueToDomain(String value) {
		return new ALIGNMENT_OBJECT(value);
	}

}
