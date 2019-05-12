package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECORDING_OF;
import org.kyojo.schemaorg.m3n5.core.Container.RecordingOf;

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
