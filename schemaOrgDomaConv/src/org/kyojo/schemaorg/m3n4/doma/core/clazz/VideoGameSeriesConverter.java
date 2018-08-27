package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.VIDEO_GAME_SERIES;
import org.kyojo.schemaorg.m3n4.core.Clazz.VideoGameSeries;

@ExternalDomain
public class VideoGameSeriesConverter implements DomainConverter<VideoGameSeries, String> {

	@Override
	public String fromDomainToValue(VideoGameSeries domain) {
		return domain.getNativeValue();
	}

	@Override
	public VideoGameSeries fromValueToDomain(String value) {
		return new VIDEO_GAME_SERIES(value);
	}

}
