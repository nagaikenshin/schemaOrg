package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.ARCHIVE_HELD;
import org.kyojo.schemaorg.m3n5.pending.Container.ArchiveHeld;

@ExternalDomain
public class ArchiveHeldConverter implements DomainConverter<ArchiveHeld, String> {

	@Override
	public String fromDomainToValue(ArchiveHeld domain) {
		return domain.getNativeValue();
	}

	@Override
	public ArchiveHeld fromValueToDomain(String value) {
		return new ARCHIVE_HELD(value);
	}

}
