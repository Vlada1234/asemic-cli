package com.asemicanalytics.cli.internal.dsgenerator.entity.activity.kpis;

import com.asemicanalytics.cli.internal.dsgenerator.entity.registration.columns.CohortDayColumn;
import com.asemicanalytics.semanticlayer.config.dto.v1.semantic_layer.KpiDto;
import com.asemicanalytics.semanticlayer.config.dto.v1.semantic_layer.XAxisDto;
import com.asemicanalytics.semanticlayer.config.dto.v1.semantic_layer.XaxisOverrideDto;

public class MauKpi extends KpiDto {
  public static final String ID = "mau";

  public MauKpi(String dateColumn) {
    super(
        "MAU",
        null,
        "SUM({property.active_last_28_days})",
        null,
        null,
        null,
        new XAxisDto() {{
          this.setAdditionalProperty(dateColumn, new XaxisOverrideDto(TotalFunction.AVG));
          this.setAdditionalProperty(CohortDayColumn.ID, new XaxisOverrideDto());
        }},
        null);
  }
}
