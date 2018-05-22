package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECORDING_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.RecordingOf;

@ExternalDomain
public class RecordingOfConverter implements DomainConverter<RecordingOf, String> {

	@Override
	public String fromDomainToValue(RecordingOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecordingOf fromValueToDomain(String value) {
		return new RECORDING_OF(value);
	}

}
